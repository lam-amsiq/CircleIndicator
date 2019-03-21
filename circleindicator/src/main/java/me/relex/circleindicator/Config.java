package me.relex.circleindicator;

import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.widget.LinearLayout;
import androidx.annotation.AnimatorRes;

public class Config {

    int width = -1;
    int height = -1;
    int margin = -1;
    @AnimatorRes int animatorResId = R.animator.scale_with_alpha;
    @AnimatorRes int animatorReverseResId = 0;
    Drawable selectedBackground;
    Drawable unselectedBackground;
    int orientation = LinearLayout.HORIZONTAL;
    int gravity = Gravity.CENTER;

    Config() {
    }

    public static class Builder {

        private final Config mConfig;

        public Builder() {
            mConfig = new Config();
        }

        public Builder width(int width) {
            mConfig.width = width;
            return this;
        }

        public Builder height(int height) {
            mConfig.height = height;
            return this;
        }

        public Builder margin(int margin) {
            mConfig.margin = margin;
            return this;
        }

        public Builder animator(@AnimatorRes int animatorResId) {
            mConfig.animatorResId = animatorResId;
            return this;
        }

        public Builder animatorReverse(@AnimatorRes int animatorReverseResId) {
            mConfig.animatorReverseResId = animatorReverseResId;
            return this;
        }

        public Builder drawable(Drawable backgroundResId) {
            mConfig.selectedBackground = backgroundResId;
            return this;
        }

        public Builder drawableUnselected(Drawable unselectedBackgroundId) {
            mConfig.unselectedBackground = unselectedBackgroundId;
            return this;
        }

        public Builder orientation(int orientation) {
            mConfig.orientation = orientation;
            return this;
        }

        public Builder gravity(int gravity) {
            mConfig.gravity = gravity;
            return this;
        }

        public Config build() {
            return mConfig;
        }
    }
}
