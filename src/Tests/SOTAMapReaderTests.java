import org.junit.Test;
import sota.SOTAMapReader;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SOTAMapReaderTests {

    private SOTAMapReader mapReader;

    public SOTAMapReaderTests() {
        mapReader = new SOTAMapReader();
    }

    @Test
    public void readingMap() {
        // given:
        String path = System.getProperty("user.home") + "\\Desktop\\map.txt";
        String[][][] test = new String[][][]{{{""}}};
        //when(mapReader.getMap()).thenReturn(test);

        // when:
        mapReader.readMap(path);

        // then:
        assertThat(mapReader.getMap(), is(test));
    }

}