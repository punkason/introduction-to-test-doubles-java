import com.techreturners.bubbleteaordersystem.service.BubbleTeaRouletteService;
import com.techreturners.bubbleteaordersystem.model.BubbleTeaTypeEnum;

import org.junit.jupiter.api.Test;
import testhelper.RandomStub;


import static org.junit.Assert.assertEquals;

public class BubbleTeaRouletteServiceTest {

    @Test
    public void shouldGenerateARandomBubbleTeaTypeWhenGetRandomBubbleTeaTypeIsCalled() {

        //Jasmine Milk Tea
        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnum.JasmineMilkTea.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.JasmineMilkTea;

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    //Activity 4 - Peach Ice Tea
    @Test
    public void shouldGenerateARandomBubbleTeaTypeWhenGetRandomBubbleTeaTypeIsCalledWithPeachIceTea() {
        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnum.PeachIceTea.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.PeachIceTea;

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    //Activity 5
    @Test
    public void parameterisedBubbleTeaTest() {
        //Arrange
        int i = 0;
        for (BubbleTeaTypeEnum expectedResult : BubbleTeaTypeEnum.values()) {
            RandomStub randomStub = new RandomStub(i);
            BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

            //Act
            var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
            //System.out.println(actualResult + " E: " + expectedResult);
            //Assert
            assertEquals(expectedResult, actualResult);
            i++;
        }
    }
}
