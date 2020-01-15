
package af.gov.anar.lib.excel.cells;

/**
 * Cell which style can be edited.
 */
abstract class AbstractStyleableCell implements ECell {

    @Override
    public final ECell with(final Style style) {
        return new ECell.WithStyle(this, style);
    }
}
