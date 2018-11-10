package jp.co.netprotections.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import jp.co.netprotections.util.RestTestBase;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MainControllerTest extends RestTestBase{

	@Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    private String targetUrl = "http://localhost:18080/main";

    // モック対象のControllerインスタンスを生成
	@Before
	public void setupMock() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	/**
	 * 正常系：001
	 * @throws Exception
	 */
	@Test
	public void test001() throws Exception {
		// モック対象へのリクエスト文字列を取得
		String body = super.readForObject("test001.json");

		// Controllerにリクエストを送り、結果を取得
		ResultActions result = mockMvc.perform(post(targetUrl)
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.content(body));

		// 結果の検査。ステータスがOKであること、および文字列の文字数が6であることを確認します
		result.andExpect(status().is(HttpStatus.OK.value()))
			.andExpect(jsonPath("$.strLength").value(6));
	}
}
