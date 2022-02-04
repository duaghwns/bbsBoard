package com.duaghwns.bbsBoard.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class IndexResponseDto {
    private final String name;
    private final int amount;
}
