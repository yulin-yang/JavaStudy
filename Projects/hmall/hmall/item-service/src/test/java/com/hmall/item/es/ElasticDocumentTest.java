package com.hmall.item.es;

import com.hmall.item.service.IItemService;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest(properties = "spring.profiles.active=local")
public class ElasticDocumentTest {

    @Autowired
    private IItemService itemService;

    private RestHighLevelClient client;


    @Test
    void testIndexDoc() throws IOException {

        IndexRequest request = new IndexRequest("items").id("1");
        request.source("{}", XContentType.JSON);
        client.index(request, RequestOptions.DEFAULT);
    }

}
