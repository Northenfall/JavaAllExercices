package ru.mirea.exercies21and22.redactor;

import java.io.FileWriter;
import java.io.IOException;

public class TextDocument implements IDocument{
    private FileWriter fw;
    @Override
    public void save() throws IOException {
        fw.close();
    }

    @Override
    public void create() throws IOException {
        fw = new FileWriter( "sample1.txt" );
    }

    @Override
    public void open() throws IOException {
        fw = new FileWriter( "sample1.txt" );
    }

    @Override
    public void close() throws IOException {
        fw.close();
    }
}