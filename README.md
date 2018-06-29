# android-mvvm-unittest
To learn android [MVVM](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel) based on [Android Architecture Components](https://developer.android.com/topic/libraries/architecture/) and unit test.

- [Kotlin](https://kotlinlang.org/) :heart:
- Start with basic and simple.
- Each example should has a unit test at least or more.


## E01 - Simple Activity

Simple [Data Binding](https://developer.android.com/topic/libraries/data-binding/),
[ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel),
[LiveData](https://developer.android.com/topic/libraries/architecture/livedata) on an Activity.

Two-way binding at EditText.

Simple Unit Test with [Espresso](https://developer.android.com/training/testing/espresso/).


## E02 - Simple Fragment with some animations

Simple [Data Binding](https://developer.android.com/topic/libraries/data-binding/),
[ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel),
[LiveData](https://developer.android.com/topic/libraries/architecture/livedata) on an Fragment.

Some animations with [lottie](http://airbnb.io/lottie/)(resources by [Eddy Gann](https://www.lottiefiles.com/ed117)).

Custom binding attribute `onAnimationEnd` using
[BindingAdapter](https://developer.android.com/topic/libraries/data-binding/binding-adapters#custom-logic).

For single Fragment android instrumented test,
there is a dummy activity which only works on debug and test that implemented with
debug [Source set](https://developer.android.com/studio/build/build-variants#sourcesets) and
[@RestrictTo](https://developer.android.com/reference/android/support/annotation/RestrictTo) annotation.

For unit test, it needs to decouple the logic that getting boolean result from ViewModel.
so [ViewModelProvider.Factory](https://developer.android.com/reference/android/arch/lifecycle/ViewModelProvider.Factory) is here.


## E02a - Simple Fragment with some animations and DI library

Based on [E02](#e02---simple-fragment-with-some-animations).

[Dependency Injection](https://en.wikipedia.org/wiki/Dependency_injection) with [Kodein DI](http://kodein.org/Kodein-DI/) as a elegant way to decouple the logic.


## E03 - RecyclerView

Simple [Data Binding](https://developer.android.com/topic/libraries/data-binding/),
[ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel),
[LiveData](https://developer.android.com/topic/libraries/architecture/livedata) on an RecyclerView.

Implementation of Add, Remove and Edit actions.

## E04 - Request Permission

[Request Permission](https://developer.android.com/training/permissions/requesting) on MVVM.

[Transformaions.map](https://developer.android.com/topic/libraries/architecture/livedata?hl=ko#transform_livedata) to convert strings to a simple format.

Mocking instance of `Observer` with [MockK](http://mockk.io/) on unit test.

## E05 - Interaction between 2 Fragments

Reuse [E02](#e02---simple-fragment-with-some-animations).

A Fragment knows two `ViewModel`, so two views observe one `ViewModel`.


## TODO

change screen with coordinator on MVVM