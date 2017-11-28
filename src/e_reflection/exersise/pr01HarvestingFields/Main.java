package e_reflection.exersise.pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		Class cl = RichSoilLand.class;

		Field[] fields = cl.getDeclaredFields();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while (true){
            if("HARVEST".equalsIgnoreCase(line = reader.readLine())){
                break;
            }

            switch (line){
                case "all" :
                    for (Field field : fields) {
                        System.out.printf("%s %s %s%n",
                                Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
                    }
                    break;
                case "protected":
                    Arrays.stream(fields).filter(field -> Modifier.isProtected(field.getModifiers()))
                            .forEach(field -> System.out.printf("%s %s %s%n",
                                    Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName()));
                    break;

                case "public":
                    Arrays.stream(fields).filter(field -> Modifier.isPublic(field.getModifiers()))
                            .forEach(field -> System.out.printf("%s %s %s%n",
                                    Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName()));
                    break;
                case "private":
                    Arrays.stream(fields).filter(field -> Modifier.isPrivate(field.getModifiers()))
                            .forEach(field -> System.out.printf("%s %s %s%n",
                                    Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName()));
                    break;

            }
        }


	}
}
