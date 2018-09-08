package Money.service.user;

import Money.common.result.R;
import Money.pojo.User;

/**
 * @ClassName UserService
 * @AuthorAdministrator
 * @Date2018/9/8 0008 10:48
 **/
public interface UserService {

    //新增
    R save(User user);
}
