package Money.mapper.user;

import Money.pojo.UserRec;

public interface UserRecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRec record);

    int insertSelective(UserRec record);

    UserRec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRec record);

    int updateByPrimaryKey(UserRec record);
}