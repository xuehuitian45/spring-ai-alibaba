package com.alibaba.cloud.ai.graph;

import com.alibaba.cloud.ai.graph.exception.GraphStateException;
import com.drew.lang.annotations.Nullable;

public class ChatResponse {

	@Nullable
	private String data;

	private ChatResponse(ChatResponseBuilder builder) {
		this.data = builder.data;
	}

    public String getData() {
        return data;
    }

	public static ChatResponseBuilder builder() {
		return new ChatResponseBuilder();
	}

	public static class ChatResponseBuilder {

		@Nullable
		private String data;

		public ChatResponseBuilder data(@Nullable String data) {
			this.data = data;
			return this;
		}

		public ChatResponse build() throws GraphStateException {
			return new ChatResponse(this);
		}

	}

}
