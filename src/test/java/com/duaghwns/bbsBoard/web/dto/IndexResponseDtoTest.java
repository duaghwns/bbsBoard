package com.duaghwns.bbsBoard.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IndexResponseDtoTest {

    @Test
    public void 롬복기능테스트(){
        String name = "test";
        int amount = 1000;

        IndexResponseDto dto = new IndexResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
