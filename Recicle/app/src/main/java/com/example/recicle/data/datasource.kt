package com.example.recicle.data

import com.example.recicle.R
import com.example.recicle.model.Afirmation

class datasource {
     fun loadAffirmation(): List<Afirmation>{

        return listOf<Afirmation>(
            Afirmation(R.string.affirmation1),
            Afirmation(R.string.affirmation2),
            Afirmation(R.string.affirmation3),
            Afirmation(R.string.affirmation4),
            Afirmation(R.string.affirmation5),
            Afirmation(R.string.affirmation6),
            Afirmation(R.string.affirmation7),
            Afirmation(R.string.affirmation8),
            Afirmation(R.string.affirmation9),
            Afirmation(R.string.affirmation10)
        )
    }
}