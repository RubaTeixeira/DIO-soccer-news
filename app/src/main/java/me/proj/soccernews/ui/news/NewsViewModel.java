package me.proj.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.proj.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover mock de notícias.
        List<News> news= new ArrayList<>();
        news.add(new News("Desfalque na Ferroviária","Sem atacante de duas da zaga ferroviária enfrenta Palmeiras."));
        news.add(new News("Palmeiras preparado","Verdão vem com tudo, embalado por duas vitórias"));
        news.add(new News("Rodada forte no sábado","Palmeiras e Ferroviária disputam liderança no sábado."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}