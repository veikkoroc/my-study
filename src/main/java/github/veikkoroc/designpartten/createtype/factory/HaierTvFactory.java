package github.veikkoroc.designpartten.createtype.factory;

/**
 * @author Veikko Roc
 * @version 1.0
 * @date 2020/10/8 23:06
 */
public class HaierTvFactory implements TvFactory {

    @Override
    public Tv createTv() {
        return new TvHaier();
    }
}
