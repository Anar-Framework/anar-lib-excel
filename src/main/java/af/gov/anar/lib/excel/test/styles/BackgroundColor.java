
package af.gov.anar.lib.excel.test.styles;

import af.gov.anar.lib.excel.Props;
import org.apache.poi.ss.usermodel.CellStyle;

/**
 * Background cell color.

 */
@SuppressWarnings("PMD.AvoidUsingShortType")
public final class BackgroundColor implements Props<CellStyle> {

    /**
     * Color.
     */
    private final short color;

    /**
     * Ctor.
     * @param rgb Rgb color value
     */
    public BackgroundColor(final short rgb) {
        this.color = rgb;
    }

    @Override
    public void accept(final CellStyle style) {
        style.setFillBackgroundColor(this.color);
    }
}