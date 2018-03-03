package app.kotlinapp

/**
 * Created by lenovopc on 2/13/2018.
 */
interface BaseView<T>{
    fun setPresenter(presenter:T)
}