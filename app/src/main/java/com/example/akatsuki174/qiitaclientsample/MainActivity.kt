package com.example.akatsuki174.qiitaclientsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.akatsuki174.qiitaclientsample.model.Article
import com.example.akatsuki174.qiitaclientsample.model.User
import com.example.akatsuki174.qiitaclientsample.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val articleView = ArticleView(applicationContext)
        articleView.setArticle(Article(
                id = "123",
                title = "Kotlin入門",
                url = "http://www.example.com/articles/123",
                user = User("456", "たろう", "")
        ))
        setContentView(articleView)
    }
}
