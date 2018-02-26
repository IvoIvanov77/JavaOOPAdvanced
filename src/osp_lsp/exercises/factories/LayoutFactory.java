package osp_lsp.exercises.factories;

import osp_lsp.exercises.contracts.Layout;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LayoutFactory {

    private static final String PATH = "osp_lsp.exercises.models.layouts.";

    public static Layout createLayout(String type) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Layout> cl = (Class<Layout>) Class.forName(PATH + type);
        Constructor<Layout> constructor = cl.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }


}
