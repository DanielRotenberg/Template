package com.danirg10000gmail.template;

/**
 * Created by DanielR on 02/07/2017.
 */

public interface MainContract {

    interface View {
        void showLog();
    }

    interface Presenter{
       void loadRepositories();
    }
}
