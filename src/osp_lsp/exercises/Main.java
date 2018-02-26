package osp_lsp.exercises;

import osp_lsp.exercises.controllers.Engine;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        Engine.execute();
    }
}