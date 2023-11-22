package aheung.likelion.twoneone.service;

import aheung.likelion.twoneone.dto.community.PostListReturnDto;
import aheung.likelion.twoneone.dto.community.PostRequestDto;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

public interface PostService {
    public void createPost(PostRequestDto dto, List<MultipartFile> files, Long userId);
    public Page<PostListReturnDto> getMyPosts(Pageable pageable, String category, String tag, Long userId);
    public Page<PostListReturnDto> getMySearchPosts(Pageable pageable, String keyword, Long userId);
}
