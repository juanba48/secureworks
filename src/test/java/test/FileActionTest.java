package test;

import com.FileAction;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileActionTest {

    private FileAction fileAction;

    @BeforeMethod
    public void setUp(){
        fileAction = new FileAction();
    }

    @Test
    @Parameters({"expectedLargestWordHappyPath","fileLocationHappyPath"})
    public void get_LargestWord_From_File_HappyPath(String expectedLargestWordHappyPath, String fileLocationHappyPath) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationHappyPath);
        Assert.assertEquals(actualLargestWord,expectedLargestWordHappyPath);
    }

    @Test
    @Parameters({"expectedTransposedWordHappyPath","fileLocationHappyPath"})
    public void get_LargestWord_Transposed_From_File_HappyPath(String expectedTransposedWordHappyPath, String fileLocationHappyPath) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationHappyPath);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordHappyPath);
    }

    @Test
    @Parameters({"expectedLargestWordOneWord","fileLocationOneWord"})
    public void get_LargestWord_From_FileOneWord(String expectedLargestWordOneWord,String fileLocationOneWord) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationOneWord);
        Assert.assertEquals(actualLargestWord,expectedLargestWordOneWord);
    }

    @Test
    @Parameters({"expectedTransposedWordOneWord","fileLocationOneWord"})
    public void get_LargestWord_Transposed_From_FileOneWord(String expectedTransposedWordOneWord, String fileLocationOneWord) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationOneWord);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordOneWord);
    }

    @Test
    @Parameters({"expectedLargestWordMultipleLargeWords","fileLocationMultipleLargeWords"})
    public void get_LargestWord_From_File_MultipleLargeWords(String expectedLargestWordMultipleLargeWords, String fileLocationMultipleLargeWords) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationMultipleLargeWords);
        Assert.assertEquals(actualLargestWord,expectedLargestWordMultipleLargeWords);
    }

    @Test
    @Parameters({"expectedTransposedWordMultipleLargeWords","fileLocationMultipleLargeWords"})
    public void get_LargestWord_Transposed_From_File_MultipleLargeWords(String expectedTransposedWordMultipleLargeWords, String fileLocationMultipleLargeWords) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationMultipleLargeWords);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordMultipleLargeWords);
    }

    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File is Empty")
    @Parameters({"fileLocationEmpty"})
    public void get_LargestWord_EmptyFile(String fileLocationEmpty) throws Exception {
       fileAction.getLargestWord(fileLocationEmpty);
    }

    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File is Empty")
    @Parameters({"fileLocationEmpty"})
    public void get_LargestWord__Transposed_EmptyFile(String fileLocationEmpty) throws Exception {
        fileAction.getLargestWordTransposed(fileLocationEmpty);
    }

    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File does not exist")
    @Parameters({"fileLocationDoesNotExist"})
    public void get_LargestWord_FileDoesNotExist(String fileLocationDoesNotExist) throws Exception {
        fileAction.getLargestWord(fileLocationDoesNotExist);
    }

    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File does not exist")
    @Parameters({"fileLocationDoesNotExist"})
    public void get_LargestWord__Transposed__FileDoesNotExist(String fileLocationDoesNotExist) throws Exception {
        fileAction.getLargestWordTransposed(fileLocationDoesNotExist);
    }

    @Test()
    @Parameters({"fileLocationMultipleWordsSameLine","expectedLargestWordMultipleWordsSameLine"})
    public void get_LargestWord_MultipleWordsSameLine(String fileLocationMultipleWordsSameLine,String expectedLargestWordMultipleWordsSameLine) throws Exception {
        String actualTransposedWord = fileAction.getLargestWord(fileLocationMultipleWordsSameLine);
        Assert.assertEquals(actualTransposedWord,expectedLargestWordMultipleWordsSameLine);;
    }

    @Test()
    @Parameters({"fileLocationMultipleWordsSameLine","expectedTransposedWordMultipleWordsSameLine"})
    public void get_LargestWord__Transposed__MultipleWordsSameLine(String fileLocationMultipleWordsSameLine, String expectedTransposedWordMultipleWordsSameLine) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationMultipleWordsSameLine);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordMultipleWordsSameLine);
    }

    @Test()
    @Parameters({"fileLocationSpecialcharacters","expectedLargestWordSpecialcharacters"})
    public void get_LargestWord_Specialcharacters(String fileLocationSpecialcharacters,String expectedLargestWordSpecialcharacters) throws Exception {
        String actualTransposedWord = fileAction.getLargestWord(fileLocationSpecialcharacters);
        Assert.assertEquals(actualTransposedWord,expectedLargestWordSpecialcharacters);;
    }

    @Test()
    @Parameters({"fileLocationSpecialcharacters","expectedTransposedWordSpecialcharacters"})
    public void get_LargestWord__Transposed__Specialcharacters(String fileLocationSpecialcharacters, String expectedTransposedWordSpecialcharacters) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationSpecialcharacters);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordSpecialcharacters);
    }

    @AfterMethod
    public void tearDown(){
        fileAction = null;
    }

}
