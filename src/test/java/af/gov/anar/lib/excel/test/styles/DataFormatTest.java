
package af.gov.anar.lib.excel.test.styles;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.io.IOException;

/**
 * Test for {@link DataFormat }.
 * @author Vedran Vatavuk (123vgv@gmail.com)
 * @version $Id$
 * @since 0.3
 */
@SuppressWarnings("PMD.AvoidUsingShortType")
public final class DataFormatTest {

    /**
     * Add data format to cell.
     * @throws IOException If fails
     */
    @Test
    public void addsDataFormatStyleToCell() throws IOException {
        try (final Workbook wbook = new XSSFWorkbook()) {
            final short expected = (short) 0;
            final CellStyle style = wbook.createCellStyle();
            new DataFormat(expected).accept(style);
            MatcherAssert.assertThat(
                style.getDataFormat(),
                Matchers.equalTo(expected)
            );
        }
    }
}
