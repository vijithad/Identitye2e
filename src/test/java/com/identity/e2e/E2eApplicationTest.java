package com.identity.e2e;

import com.identity.e2e.helpers.Log;
import com.identity.e2e.model.E2eFile;
import com.identity.e2e.model.FileTypeEnum;
import com.identity.e2e.service.FileService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class E2eApplicationTest {

    @Test  // Junit test to cover the Get Excelfiles functionality of service bean
    public void testGetExcelFiles() throws Exception {
        Log.startTestCase();
        FileService fileService = new FileService();
        List<E2eFile> files = fileService.getFiles(FileTypeEnum.XLS, System.getProperty("user.dir")+"/src/test/resource");
        Assert.assertTrue("The number of files should be", files.size() == 1);
        files.forEach(file -> {
            Assert.assertTrue("",file.getExtension().equalsIgnoreCase(FileTypeEnum.XLS.name()));
            Assert.assertTrue("", file.getName().endsWith( FileTypeEnum.XLS.type.toLowerCase()));
            Assert.assertThat(file.getSize(),is(Long.valueOf(8679)));
            Assert.assertTrue("",file.getMimeType().equals("application/octet-stream"));
            Assert.assertThat(file.getFile(), is(notNullValue()));
        });
        Log.endTestCase();
    }

    @Test // Junit test to cover the Get CSV files functionality of service bean
    public void testGetCSVFiles() throws Exception {
        Log.startTestCase();
        FileService fileService = new FileService();
        List<E2eFile> files = fileService.getFiles(FileTypeEnum.CSV, System.getProperty("user.dir")+"/src/test/resource");
        Assert.assertTrue("The number of files should be", files.size() == 1);
        files.forEach(file -> {
            Assert.assertTrue("",file.getExtension().equalsIgnoreCase(FileTypeEnum.CSV.name()));
            Assert.assertTrue("", file.getName().endsWith( FileTypeEnum.CSV.type.toLowerCase()));
            Assert.assertThat(file.getSize(),is(Long.valueOf(68)));
            Assert.assertTrue("",file.getMimeType().equals("application/octet-stream"));
            Assert.assertThat(file.getFile(), is(notNullValue()));
        });
        Log.endTestCase();
    }

}
