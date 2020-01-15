
package af.gov.anar.lib.excel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.IOException;

/**
 * Sheet.
 */
public interface ESheet {

    /**
     * Attach sheet to a workbook.
     * @param workbook Workbook
     * @return Sheet
     * @throws IOException If fails
     */
    Sheet attachTo(Workbook workbook) throws IOException;

    /**
     * Add row to the sheet.
     * @param row Row
     * @return Sheet
     */
    ESheet with(ERow row);

    /**
     * Add style to the sheet.
     * @param style Style
     * @return Sheet
     */
    ESheet with(Style style);
}
