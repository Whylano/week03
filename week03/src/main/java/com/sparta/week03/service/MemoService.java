package com.sparta.week03.service;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.domain.MemoRequestDto;
import com.sparta.week03.domain.SearchTitleResponeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MemoService {
    private final MemoRepository memoRepository;

    @Transactional
    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        memo.update(requestDto);
        return memo.getId();
    }

    public List<SearchTitleResponeDto> getTitle(String title) {
        List<Memo> listmemo = memoRepository.findByTitle(title);
        List<SearchTitleResponeDto> result = new ArrayList<>();
        for (int i = 0; i < listmemo.size(); i++) {
            Memo oldObject = listmemo.get(i);
            SearchTitleResponeDto newObject = new SearchTitleResponeDto(oldObject.getTitle(), oldObject.getUsername(), oldObject.getContents());
            //title set

            result.add(newObject);
        }
        return result;
    }
//    @Transactional
//    public boolean checkPassword(Long id, String password){
//        Memo memo = MemoRepository.findById(id).get();
//        if (!memo.getPassword().equals(password)) {
//            return false;
//        }
//        return true;
//    }
}

