package osp_lsp.exercises.factories;

import osp_lsp.exercises.contracts.Appender;
import osp_lsp.exercises.contracts.Layout;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppenderFactory {

    private static final String PATH = "osp_lsp.exercises.models.appenders.";

    public static Appender createAppender(String type, Layout layout) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Appender> cl = (Class<Appender>) Class.forName(PATH + type);
        Constructor<Appender> constructor = cl.getDeclaredConstructor(Layout.class);
        constructor.setAccessible(true);
        return constructor.newInstance(layout);
    }
}
