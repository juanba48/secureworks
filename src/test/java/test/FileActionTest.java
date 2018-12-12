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

    /**
     * Test using a file with only one word for {@link FileAction#getLargestWord(String)}
     * @param expectedLargestWordOneWord - expected largest word as result of the test
     * @param fileLocationOneWord - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test
    @Parameters({"expectedLargestWordOneWord","fileLocationOneWord"})
    public void get_LargestWord_From_File_OneWord(String expectedLargestWordOneWord,String fileLocationOneWord) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationOneWord);
        Assert.assertEquals(actualLargestWord,expectedLargestWordOneWord);
    }

    /**
     * Test using a file with only one word for {@link FileAction#getLargestWordTransposed(String)}
     * @param expectedTransposedWordOneWord - expected transposed word as result of the test
     * @param fileLocationOneWord - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test
    @Parameters({"expectedTransposedWordOneWord","fileLocationOneWord"})
    public void get_LargestWord_Transposed_From_File_OneWord(String expectedTransposedWordOneWord, String fileLocationOneWord) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationOneWord);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordOneWord);
    }

    /**
     * Test using a file with multiple large words for {@link FileAction#getLargestWord(String)}
     * @param expectedLargestWordMultipleLargeWords - expected largest word as result of the test
     * @param fileLocationMultipleLargeWords - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test
    @Parameters({"expectedLargestWordMultipleLargeWords","fileLocationMultipleLargeWords"})
    public void get_LargestWord_From_File_MultipleLargeWords(String expectedLargestWordMultipleLargeWords, String fileLocationMultipleLargeWords) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationMultipleLargeWords);
        Assert.assertEquals(actualLargestWord,expectedLargestWordMultipleLargeWords);
    }

    /**
     * Test using a file with multiple large words for {@link FileAction#getLargestWordTransposed(String)}
     * @param expectedTransposedWordMultipleLargeWords - expected largest word as result of the test
     * @param fileLocationMultipleLargeWords - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test
    @Parameters({"expectedTransposedWordMultipleLargeWords","fileLocationMultipleLargeWords"})
    public void get_LargestWord_Transposed_From_File_MultipleLargeWords(String expectedTransposedWordMultipleLargeWords, String fileLocationMultipleLargeWords) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationMultipleLargeWords);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordMultipleLargeWords);
    }

    /**
     * Test using an empty file for {@link FileAction#getLargestWord(String)}
     * @param fileLocationEmpty - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File is Empty")
    @Parameters({"fileLocationEmpty"})
    public void get_LargestWord_File_Empty(String fileLocationEmpty) throws Exception {
       fileAction.getLargestWord(fileLocationEmpty);
    }

    /**
     * Test using an empty file for {@link FileAction#getLargestWordTransposed(String)}
     * @param fileLocationEmpty - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File is Empty")
    @Parameters({"fileLocationEmpty"})
    public void get_LargestWord__Transposed_File_Empty(String fileLocationEmpty) throws Exception {
        fileAction.getLargestWordTransposed(fileLocationEmpty);
    }

    /**
     * Test using a file that does not exist for {@link FileAction#getLargestWord(String)}
     * @param fileLocationDoesNotExist - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File does not exist")
    @Parameters({"fileLocationDoesNotExist"})
    public void get_LargestWord_File_DoesNotExist(String fileLocationDoesNotExist) throws Exception {
        fileAction.getLargestWord(fileLocationDoesNotExist);
    }

    /**
     * Test using a file that does not exist for {@link FileAction#getLargestWordTransposed(String)}
     * @param fileLocationDoesNotExist - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp ="File does not exist")
    @Parameters({"fileLocationDoesNotExist"})
    public void get_LargestWord__Transposed__File_DoesNotExist(String fileLocationDoesNotExist) throws Exception {
        fileAction.getLargestWordTransposed(fileLocationDoesNotExist);
    }

    /**
     * Test using a file with multiple words in the same line for {@link FileAction#getLargestWord(String)}
     * @param expectedLargestWordMultipleWordsSameLine - expected largest word as result of the test
     * @param fileLocationMultipleWordsSameLine - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test()
    @Parameters({"fileLocationMultipleWordsSameLine","expectedLargestWordMultipleWordsSameLine"})
    public void get_LargestWord_File_MultipleWordsSameLine(String fileLocationMultipleWordsSameLine,String expectedLargestWordMultipleWordsSameLine) throws Exception {
        String actualTransposedWord = fileAction.getLargestWord(fileLocationMultipleWordsSameLine);
        Assert.assertEquals(actualTransposedWord,expectedLargestWordMultipleWordsSameLine);;
    }

    /**
     * Test using a file with multiple words in the same line for {@link FileAction#getLargestWordTransposed(String)}
     * @param expectedTransposedWordMultipleWordsSameLine - expected largest word as result of the test
     * @param fileLocationMultipleWordsSameLine - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test()
    @Parameters({"fileLocationMultipleWordsSameLine","expectedTransposedWordMultipleWordsSameLine"})
    public void get_LargestWord__Transposed_File_MultipleWordsSameLine(String fileLocationMultipleWordsSameLine, String expectedTransposedWordMultipleWordsSameLine) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationMultipleWordsSameLine);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordMultipleWordsSameLine);
    }

    /**
     * Test using a file with special Characters for {@link FileAction#getLargestWord(String)}
     * @param expectedLargestWordSpecialcharacters - expected largest word as result of the test
     * @param fileLocationSpecialcharacters - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test()
    @Parameters({"fileLocationSpecialcharacters","expectedLargestWordSpecialcharacters"})
    public void get_LargestWord_File_Specialcharacters(String fileLocationSpecialcharacters,String expectedLargestWordSpecialcharacters) throws Exception {
        String actualTransposedWord = fileAction.getLargestWord(fileLocationSpecialcharacters);
        Assert.assertEquals(actualTransposedWord,expectedLargestWordSpecialcharacters);;
    }

    /**
     * Test using a file with special Characters for {@link FileAction#getLargestWordTransposed(String)}
     * @param expectedTransposedWordSpecialcharacters - expected largest word as result of the test
     * @param fileLocationSpecialcharacters - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test()
    @Parameters({"fileLocationSpecialcharacters","expectedTransposedWordSpecialcharacters"})
    public void get_LargestWord__Transposed_File_Specialcharacters(String fileLocationSpecialcharacters, String expectedTransposedWordSpecialcharacters) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationSpecialcharacters);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordSpecialcharacters);
    }

    /**
     * Test using a file with a line with a lot of blank spaces for {@link FileAction#getLargestWord(String)}
     * @param expectedLargestWordLineWithSpaces - expected largest word as result of the test
     * @param fileLocationLineWithSpaces - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test
    @Parameters({"expectedLargestWordLineWithSpaces","fileLocationLineWithSpaces"})
    public void get_LargestWord_From_File_LineWithSpaces(String expectedLargestWordLineWithSpaces, String fileLocationLineWithSpaces) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationLineWithSpaces);
        Assert.assertEquals(actualLargestWord,expectedLargestWordLineWithSpaces);
    }

    /**
     * Test using a file with a line with a lot of blank spaces for {@link FileAction#getLargestWordTransposed(String)}
     * @param expectedTransposedWordLineWithSpaces - expected largest word as result of the test
     * @param fileLocationLineWithSpaces - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test
    @Parameters({"expectedTransposedWordLineWithSpaces","fileLocationLineWithSpaces"})
    public void get_LargestWord_Transposed_From_File_LineWithSpaces(String expectedTransposedWordLineWithSpaces, String fileLocationLineWithSpaces) throws Exception {
        String actualTransposedWord = fileAction.getLargestWordTransposed(fileLocationLineWithSpaces);
        Assert.assertEquals(actualTransposedWord,expectedTransposedWordLineWithSpaces);
    }

    /**
     * Test using a file that starts with lot of blank lines for {@link FileAction#getLargestWord(String)}
     * @param expectedLargestWordStartWithBlankLines - expected largest word as result of the test
     * @param fileLocationStartWithBlankLines - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
    @Test
    @Parameters({"expectedLargestWordStartWithBlankLines","fileLocationStartWithBlankLines"})
    public void get_LargestWord_From_File_StartWithBlankLines(String expectedLargestWordStartWithBlankLines, String fileLocationStartWithBlankLines) throws Exception {
        String actualLargestWord = fileAction.getLargestWord(fileLocationStartWithBlankLines);
        Assert.assertEquals(actualLargestWord,expectedLargestWordStartWithBlankLines);
    }

    /**
     * Test using a file that starts with lot of blank lines for {@link FileAction#getLargestWordTransposed(String)}
     * @param expectedTransposedWordStartWithBlankLines - expected largest word as result of the test
     * @param fileLocationStartWithBlankLines - location of the file used in the test
     * @throws Exception - Exception that can be thrown from the method under test
     */
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
