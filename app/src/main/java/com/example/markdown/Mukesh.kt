package com.example.markdown

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mukesh.MarkdownView

class Mukesh: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.mukesh_fragment, container, false)

        root.findViewById<MarkdownView>(R.id.markdown_view).loadUrl("https://drive.google.com/open?id=109qFCHKiwCGllzqiuTrmHLbHOPuFZT8M")
        return root
    }
}