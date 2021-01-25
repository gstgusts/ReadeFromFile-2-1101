package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

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

    @Test
    public void get_all_lines_from_small_file_gets_at_least_one_line() {
        var fileReader = new FileReader();

        var data = fileReader.getTextLinesOfSmallFile("src/com/company/test.txt");

        Assert.assertTrue(data.size() > 0);
    }

    @Test
    public void get_file_content_using_data_input_stream_gets_some_text() {
        var fileReader = new FileReader();

        var result = fileReader.getFileContentUsingDataInputStream("src/com/company/test.txt");

        Assert.assertFalse(result.isBlank());
    }
}
