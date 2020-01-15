
package af.gov.anar.lib.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Row.
 */
public interface ERow {

    /**
     * Attach row to a sheet.
     * @param sheet Sheet
     * @return Row
     */
    Row attachTo(Sheet sheet);

    /**
     * Add style to the row.
     * @param style Style
     * @return Row
     */
    ERow with(Style style);

    /**
     * Add cells to the row.
     * @param cells Cells
     * @return Row
     */
    ERow with(ECell... cells);

    /**
     * Add cells to the row.
     * @param cells Cells
     * @return Row
     */
    ERow with(ECells cells);

    /**
     * Add props to the row.
     * @param props Properties
     * @return Row
     */
    ERow with(Props<Row> props);
}
