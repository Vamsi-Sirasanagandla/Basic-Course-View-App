package com.example.assignment2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class RatingFragment: DialogFragment(R.layout.rating_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancel : Button = view.findViewById(R.id.cancelButton);
        val submit : Button = view.findViewById(R.id.submitButton);
        val radioGroup = view.findViewById<RadioGroup>(R.id.ratingGroup)
        cancel.setOnClickListener{
            dismiss()
        }
        submit.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(context,radioButton.text,Toast.LENGTH_SHORT).show()
            val m1:FeedbackActivity=getActivity() as FeedbackActivity;
            m1.receiveFeedback(radioButton.text.toString())
            dismiss()
        }
    }
}