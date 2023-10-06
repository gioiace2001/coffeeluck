package cmc.nguyenvietgioi.luckcoffee.mapper;

import cmc.nguyenvietgioi.luckcoffee.domain.Tag;
import cmc.nguyenvietgioi.luckcoffee.dto.TagDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class TagMapper implements EntityMapper<TagDto, Tag> {
    @Override
    public TagDto toDo(Tag tag) {
        return null;
    }

    @Override
    public Tag toEntity(TagDto tagDto) {
        return null;
    }

    @Override
    public List<TagDto> toDo(List<Tag> e) {
        return null;
    }

    @Override
    public List<Tag> toEntity(List<TagDto> d) {
        return null;
    }
}
