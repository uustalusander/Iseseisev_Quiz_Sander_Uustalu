package com.example.sander.iseseisevquiz;

import com.example.iseseisevquiz.R;

public class QuizBook
{
    public static String[] questions = new String []
            {
                    "Taevas on sinist värvi",
                    "Ma tegin selle quiz appi umbes 3 nädalat hiljem",
                    "Aastavahetus on 31. detsember",
                    "Siin quizil on 11 küsimust",
                    "Siin pildil on kass",
                    "Eelmisel pildil oli koer",
                    "Kas mul oli tõsiselt lõbus kui ma tegin seda appi",
                    "TTHK asub Tartus",
                    "Tallinnas on 500 elanikku",
                    "See on viimane küsimus"
            };


            public static int[] images = new int[]
                    {
                        R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6,
                            R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10
                    };


            public static boolean[] answers = new boolean[]
                    {
                            true, true, true, false, true, false, false, false, false, true
                    };
}
