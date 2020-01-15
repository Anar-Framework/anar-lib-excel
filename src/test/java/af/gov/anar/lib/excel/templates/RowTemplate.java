
package af.gov.anar.lib.excel.templates;

import com.vgv.excel.io.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Template to build custom rows.
 *
 *  <p>This is how you can use it:</p>
 *
 * <pre> class MyGoldRow extends RowTemplate {
 *      public MyGoldRow(final ERow row) {
 *          super(row.with(
 *              new XsStyle(
 *                  new ForegroundColor(IndexedColors.GOLD.getIndex()),
 *                  new FillPattern(FillPatternType.SOLID_FOREGROUND)
 *              )
 *          ));
 *      }
 *  }
 * </pre>
 */
public class RowTemplate implements ERow {

    /**
     * Origin row.
     */
    private final ERow origin;

    /**
     * Ctor.
     * @param row Row
     */
    public RowTemplate(final ERow row) {
        this.origin = row;
    }

    @Override
    public final Row attachTo(final Sheet sheet) {
        return this.origin.attachTo(sheet);
    }

    @Override
    public final ERow with(final Style style) {
        return this.origin.with(style);
    }

    @Override
    public final ERow with(final ECell... cells) {
        return this.origin.with(cells);
    }

    @Override
    public final ERow with(final ECells cells) {
        return this.origin.with(cells);
    }

    @Override
    public final ERow with(final Props<Row> props) {
        return this.origin.with(props);
    }
}
