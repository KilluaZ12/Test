package com.example.test

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.test.main.MainActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.edit_text_first_value)).perform(ViewActions.typeText("2"))
            Espresso.onView(withId(R.id.edit_text_first_value)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.edit_text_second_value)).perform(ViewActions.typeText("6"))
            Espresso.onView(withId(R.id.edit_text_second_value)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.btn_calc_add)).perform(ViewActions.click())
            delay(1000)
            Espresso.onView(withId(R.id.text_view_result)).check(ViewAssertions.matches(ViewMatchers.withText("8")))
            delay(1000)
        }
    }

    @Test
    fun simpleDivide() {
        runBlocking {
            Espresso.onView(withId(R.id.edit_text_first_value)).perform(ViewActions.typeText("36"))
            Espresso.onView(withId(R.id.edit_text_first_value)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.edit_text_second_value)).perform(ViewActions.typeText("6"))
            Espresso.onView(withId(R.id.edit_text_second_value)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.btn_calc_divide)).perform(ViewActions.click())
            delay(1000)
            Espresso.onView(withId(R.id.text_view_result)).check(ViewAssertions.matches(ViewMatchers.withText("6")))
            delay(1000)
        }
    }
}