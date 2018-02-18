/*
 * Copyright 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.textswitcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;

public class MainActivity extends Activity {
    private TextSwitcher mSwitcher, sw1;
    private int mCounter = 0;
    private String st = "";
    private int num, inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_main);
        mSwitcher = findViewById(R.id.switcher);
        sw1 = findViewById(R.id.sw1);
        mSwitcher.setFactory(mFactory);
        sw1.setFactory(mFactory);
        Button nextButton = findViewById(R.id.button);
        Button button10 = findViewById(R.id.button10);
        Button button100 = findViewById(R.id.button100);
        Button button1000 = findViewById(R.id.button1000);
        Button buttons1 = findViewById(R.id.buttons1);
        Button buttons10 = findViewById(R.id.buttons10);
        Button buttons100 = findViewById(R.id.buttons100);
        Button buttons1000 = findViewById(R.id.buttons1000);
        Button buttonclr = findViewById(R.id.buttonclr);
        Button buttonset = findViewById(R.id.buttonset);
        final EditText editset = findViewById(R.id.editset);
        /*
         * Set the in and out animations. Using the fade_in/out animations
         * provided by the framework.
         */
        Animation in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        Animation out = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out);
        mSwitcher.setInAnimation(in);
        mSwitcher.setOutAnimation(out);
        sw1.setInAnimation(out);
        sw1.setInAnimation(in);

        buttonset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editset.getText().toString().length() == 0) {
                    mCounter = 0;
                } else if (editset.getText().toString().length() >= 6)
                    mCounter = 100000;
                else
                    mCounter = Integer.valueOf(editset.getText().toString());
                st = "";
                num = mCounter;
                if (num == 0) {
                    st = "0";
                }
                while (num > 0) {
                    inp = num % 2;
                    num = num / 2;
                    st = inp + st;
                }
                sw1.setText(String.valueOf("เลขขฐาน 2 = " + st));
                mSwitcher.setText(String.valueOf("เลขฐาน 10 = " + mCounter));
            }
        });
        buttonclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = 0;
                st = "0";
                sw1.setText(String.valueOf("เลขขฐาน 2 = " + st));
                mSwitcher.setText(String.valueOf("เลขฐาน 10 = " + mCounter));
            }
        });
        buttons1000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter < 1000) {
                    mCounter = 1000;
                }
                mCounter -= 1000;
                st = "";
                num = mCounter;
                if (num == 0) {
                    st = "0";
                }
                while (num > 0) {
                    inp = num % 2;
                    num = num / 2;
                    st = inp + st;
                }
                sw1.setText(String.valueOf("เลขขฐาน 2 = " + st));
                mSwitcher.setText(String.valueOf("เลขฐาน 10 = " + mCounter));
            }
        });
        buttons100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter < 100) {
                    mCounter = 100;
                }
                mCounter -= 100;
                st = "";
                num = mCounter;
                if (num == 0) {
                    st = "0";
                }
                while (num > 0) {
                    inp = num % 2;
                    num = num / 2;
                    st = inp + st;
                }
                sw1.setText(String.valueOf("เลขขฐาน 2 = " + st));
                mSwitcher.setText(String.valueOf("เลขฐาน 10 = " + mCounter));
            }
        });
        buttons1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter < 1) {
                    mCounter = 1;
                }
                mCounter -= 1;
                st = "";
                num = mCounter;
                if (num == 0) {
                    st = "0";
                }
                while (num > 0) {
                    inp = num % 2;
                    num = num / 2;
                    st = inp + st;
                }
                sw1.setText(String.valueOf("เลขขฐาน 2 = " + st));
                mSwitcher.setText(String.valueOf("เลขฐาน 10 = " + mCounter));
            }
        });
        buttons10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter < 10) {
                    mCounter = 10;
                }
                mCounter -= 10;
                st = "";
                num = mCounter;
                if (num == 0) {
                    st = "0";
                }
                while (num > 0) {
                    inp = num % 2;
                    num = num / 2;
                    st = inp + st;
                }
                sw1.setText(String.valueOf("เลขขฐาน 2 = " + st));
                mSwitcher.setText(String.valueOf("เลขฐาน 10 = " + mCounter));
            }
        });
        button1000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter += 1000;
                if (mCounter > 100000) {
                    mCounter = 100000;
                }
                st = "";
                num = mCounter;
                while (num > 0) {
                    inp = num % 2;
                    num = num / 2;
                    st = inp + st;
                }
                sw1.setText(String.valueOf("เลขขฐาน 2 = " + st));
                mSwitcher.setText(String.valueOf("เลขฐาน 10 = " + mCounter));
            }
        });
        button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter += 100;
                if (mCounter > 100000) {
                    mCounter = 100000;
                }
                st = "";
                num = mCounter;
                while (num > 0) {
                    inp = num % 2;
                    num = num / 2;
                    st = inp + st;
                }
                sw1.setText(String.valueOf("เลขขฐาน 2 = " + st));
                mSwitcher.setText(String.valueOf("เลขฐาน 10 = " + mCounter));
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter += 10;
                if (mCounter > 100000) {
                    mCounter = 100000;
                }
                st = "";
                num = mCounter;
                while (num > 0) {
                    inp = num % 2;
                    num = num / 2;
                    st = inp + st;
                }
                sw1.setText(String.valueOf("เลขฐาน 2 = " + st));
                mSwitcher.setText(String.valueOf("เลขฐาน 10 = " + mCounter));
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mCounter++;
                if (mCounter > 100000) {
                    mCounter = 100000;
                }
                st = "";
                num = mCounter;
                while (num > 0) {

                    inp = num % 2;
                    num = num / 2;
                    st = inp + st;
                }
                sw1.setText(String.valueOf("เลขขฐาน 2 = " + st));
                mSwitcher.setText(String.valueOf("เลขฐาน 10 = " + mCounter));
            }
        });

        // Set the initial text without an animation
        mSwitcher.setCurrentText(String.valueOf("เลขฐาน 10 = " + mCounter));
        sw1.setCurrentText(String.valueOf("เลขฐาน 2 = " + mCounter));
    }

    // BEGIN_INCLUDE(factory)
    /**
     * The {@link android.widget.ViewSwitcher.ViewFactory} used to create {@link android.widget.TextView}s that the
     * {@link android.widget.TextSwitcher} will switch between.
     */
    private ViewFactory mFactory = new ViewFactory() {

        @Override
        public View makeView() {

            // Create a new TextView
            TextView t = new TextView(MainActivity.this);
            t.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
            t.setTextAppearance(MainActivity.this, android.R.style.TextAppearance_Large);
            return t;
        }
    };
    // END_INCLUDE(factory)
}
