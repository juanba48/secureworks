package test;

import com.FileAction;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Unit test cases for Class: {@link FileAction}
 */
public class FileActionTest {

    private FileAction fileAction;


    /**
     * Initialize the test object before running the test cases
     */
    @BeforeMethod
    public void setUp(){
        fileAction = new FileAction();
    }

    /**
     * Test Happy path for {@link FileAction#getLargestWord(String)}
      * @param expectedLargestWordHappyPath - expected largest word as result of the test
     * @param fileLocationHappyPath - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test
    @Parameters({"expectedLargestWordHappyPath","fileLocationHappyPath"})
    public void get_LargestWord_From_File_HappyPath(String expectedLargestWordHappyPath, String fileLocationHappyPath) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationHappyPath);
        Assert.assertEquals(actualLargestWord,expectedLargestWordHappyPath);
    }

    /**
     * Test Happy path for {@link FileAction#getLargestWordTransposed(String)}
     * @param expectedTransposedWordHappyPath - expected transposed word as result of the test
     * @param fileLocationHappyPath - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test
    @Parameters({"expectedTransposedWordHappyPath","fileLocationHappyPath"})
    public void get_LargestWord_Transposed_From_File_HappyPath(String expectedTransposedWordHappyPath, String fileLocationHappyPath) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationHappyPath);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordHappyPath);
    }

    @Test
    @Parameters({"expectedLargestWordOneWord","fileLocationOneWord"})
    public void get_LargestWord_From_File_OneWord(String expectedLargestWordOneWord,String fileLocationOneWord) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationOneWord);
        Assert.assertEquals(actualLargestWord,expectedLargestWordOneWord);
    }

    @Test
    @Parameters({"expectedTransposedWordOneWord","fileLocationOneWord"})
    public void get_LargestWord_Transposed_From_File_OneWord(String expectedTransposedWordOneWord, String fileLocationOneWord) throws Exception {
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
    public void get_LargestWord_File_Empty(String fileLocationEmpty) throws Exception {
       fileAction.getLargestWord(fileLocationEmpty);
    }

    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File is Empty")
    @Parameters({"fileLocationEmpty"})
    public void get_LargestWord__Transposed_File_Empty(String fileLocationEmpty) throws Exception {
        fileAction.getLargestWordTransposed(fileLocationEmpty);
    }

    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File does not exist")
    @Parameters({"fileLocationDoesNotExist"})
    public void get_LargestWord_File_DoesNotExist(String fileLocationDoesNotExist) throws Exception {
        fileAction.getLargestWord(fileLocationDoesNotExist);
    }

    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File does not exist")
    @Parameters({"fileLocationDoesNotExist"})
    public void get_LargestWord__Transposed__File_DoesNotExist(String fileLocationDoesNotExist) throws Exception {
        fileAction.getLargestWordTransposed(fileLocationDoesNotExist);
    }

    @Test()
    @Parameters({"fileLocationMultipleWordsSameLine","expectedLargestWordMultipleWordsSameLine"})
    public void get_LargestWord_File_MultipleWordsSameLine(String fileLocationMultipleWordsSameLine,String expectedLargestWordMultipleWordsSameLine) throws Exception {
        String actualTransposedWord = fileAction.getLargestWord(fileLocationMultipleWordsSameLine);
        Assert.assertEquals(actualTransposedWord,expectedLargestWordMultipleWordsSameLine);;
    }

    @Test()
    @Parameters({"fileLocationMultipleWordsSameLine","expectedTransposedWordMultipleWordsSameLine"})
    public void get_LargestWord__Transposed_File_MultipleWordsSameLine(String fileLocationMultipleWordsSameLine, String expectedTransposedWordMultipleWordsSameLine) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationMultipleWordsSameLine);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordMultipleWordsSameLine);
    }

    @Test()
    @Parameters({"fileLocationSpecialcharacters","expectedLargestWordSpecialcharacters"})
    public void get_LargestWord_File_Specialcharacters(String fileLocationSpecialcharacters,String expectedLargestWordSpecialcharacters) throws Exception {
        String actualTransposedWord = fileAction.getLargestWord(fileLocationSpecialcharacters);
        Assert.assertEquals(actualTransposedWord,expectedLargestWordSpecialcharacters);;
    }

    @Test()
    @Parameters({"fileLocationSpecialcharacters","expectedTransposedWordSpecialcharacters"})
    public void get_LargestWord__Transposed_File_Specialcharacters(String fileLocationSpecialcharacters, String expectedTransposedWordSpecialcharacters) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationSpecialcharacters);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordSpecialcharacters);
    }

    @Test
    @Parameters({"expectedLargestWordLineWithSpaces","fileLocationLineWithSpaces"})
    public void get_LargestWord_From_File_LineWithSpaces(String expectedLargestWordLineWithSpaces, String fileLocationLineWithSpaces) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationLineWithSpaces);
        Assert.assertEquals(actualLargestWord,expectedLargestWordLineWithSpaces);
    }

    @Test
    @Parameters({"expectedTransposedWordLineWithSpaces","fileLocationLineWithSpaces"})
    public void get_LargestWord_Transposed_From_File_LineWithSpaces(String expectedTransposedWordLineWithSpaces, String fileLocationLineWithSpaces) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationLineWithSpaces);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordLineWithSpaces);
    }

    @Test
    @Parameters({"expectedLargestWordStartWithBlankLines","fileLocationStartWithBlankLines"})
    public void get_LargestWord_From_File_StartWithBlankLines(String expectedLargestWordStartWithBlankLines, String fileLocationStartWithBlankLines) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationStartWithBlankLines);
        Assert.assertEquals(actualLargestWord,expectedLargestWordStartWithBlankLines);
    }

    @Test
    @Parameters({"expectedTransposedWordStartWithBlankLines","fileLocationStartWithBlankLines"})
    public void get_LargestWord_Transposed_From_File_StartWithBlankLines(String expectedTransposedWordStartWithBlankLines, String fileLocationStartWithBlankLines) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationStartWithBlankLines);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordStartWithBlankLines);
    }

    /**
     * Teardown the test object after running all the test cases
     */
    @AfterMethod
    public void tearDown(){
        fileAction = null;
    }

}
