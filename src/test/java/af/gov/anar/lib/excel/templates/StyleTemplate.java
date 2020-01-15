
package af.gov.anar.lib.excel.templates;

import com.vgv.excel.io.Props;
import com.vgv.excel.io.Style;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;

/**
 * Template to build custom styles.
 *
 *  <p>This is how you can use it:</p>
 *
 * <pre> class MyGoldStyle extends StyleTemplate {
 *      public MyGoldStyle(final Style style) {
 *          super(style
 *                  .with(
 *                      new ForegroundColor(IndexedColors.GOLD.getIndex()
 *                  )
 *                  .with(
 *                      new FillPattern(FillPatternType.SOLID_FOREGROUND)
 *              )
 *          ));
 *      }
 *  }
 * </pre>
 */
public class StyleTemplate implements Style {

    /**
     * Origin style.
     */
    private final Style origin;

    /**
     * Ctor.
     * @param style Style
     */
    public StyleTemplate(final Style style) {
        this.origin = style;
    }

    @Override
    public final CellStyle attachTo(final Cell cell) {
        return this.origin.attachTo(cell);
    }

    @Override
    public final Style with(final Props<CellStyle> property) {
        return this.origin.with(property);
    }
}
