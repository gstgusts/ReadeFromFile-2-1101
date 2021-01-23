package com.company;

import org.junit.Assert;
import org.junit.Test;

public class FileReaderTests {
    @Test
    public void get_file_content_returns_content() {
        var fileReader = new FileReader();

        var data = fileReader.getFileContent("test.txt");

        Assert.assertFalse(data.isBlank());
    }

    @Test
    public void get_file_lines_returns_some_lines() {
        var fileReader = new FileReader();

        var data = fileReader.getAllLines("test.txt");

        Assert.assertTrue(data.size() > 0);
    }
}
