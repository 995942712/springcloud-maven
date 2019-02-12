package com.ming.authservice.service.user;

import com.ming.authservice.dao.user.UserDao;
import com.ming.authservice.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * ///////////////////////////////////////////////////
 * //                    _ooOoo_                    //
 * //                   o8888888o                   //
 * //                   88" . "88                   //
 * //                   (| -_- |)                   //
 * //                   O\  =  /O                   //
 * //                ____/`---'\____                //
 * //              .'  \\|     |//  `.              //
 * //             /  \\|||  :  |||//  \             //
 * //            /  _||||| -:- |||||-  \            //
 * //            |   | \\\  -  /// |   |            //
 * //            | \_|  ''\---/''  |   |            //
 * //            \  .-\__  `-`  ___/-. /            //
 * //          ___`. .'  /--.--\  `. . __           //
 * //       ."" '<  `.___\_<|>_/___.'  >'"".        //
 * //      | | :  `- \`.;`\ _ /`;.`/ - ` : | |      //
 * //      \  \ `-.   \_ __\ /__ _/   .-` /  /      //
 * // ======`-.____`-.___\_____/___.-`____.-'====== //
 * //                    `=---='                    //
 * // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ //
 * //          佛祖保佑        永无BUG               //
 * // 佛曰:                                         //
 * //        写字楼里写字间,写字间里程序员.            //
 * //        程序人员写程序,又拿程序换酒钱.            //
 * //        酒醒只在网上坐,酒醉还来网下眠.            //
 * //        酒醉酒醒日复日,网上网下年复年.            //
 * //        但愿老死电脑间,不愿鞠躬老板前.            //
 * //        奔驰宝马贵者趣,公交自行程序员.            //
 * //        别人笑我忒疯癫,我笑自己命太贱.            //
 * //        不见满街漂亮妹,哪个归得程序员.            //
 * ///////////////////////////////////////////////////
 */
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private ModuleDao moduleDao;
//    @Autowired
//    private RoleDao roleDao;
    @Autowired
    private UserDao userDao;
//    @Autowired
//    private UserRoleDao userRoleDao;

    @Override
    public List<User> findAll() {
        List<User> list = this.userDao.findAll();
        if (null == list || list.size() == 0) {
            return new ArrayList<>();
        }
        return list;
    }

    @Override
    public List<User> findList(User user) {
        List<User> list = this.userDao.findList(user);
        if (null == list || list.size() == 0) {
            return new ArrayList<>();
        }
        return list;
    }

    @Override
    public User findById(Integer id) {
        User user = this.userDao.findById(id);
        if (null == user) {
            return new User();
        }
        return user;
    }

    @Override
    public User findByLoginName(String loginName) {
        User user = this.userDao.findByLoginName(loginName);
        if (null == user) {
            return new User();
        }
        return user;
    }

//    public List<UserRole> findUserRole(UserRole userRole) {
//        return this.userRoleDao.findList(userRole);
//    }

//    @Override
//    public boolean save(Integer roleId, User user) {
//        if (null == user) {
//            return false;
//        }
//        //密码加密
//        String password = new SimpleHash("MD5", user.getPassword(), ByteSource.Util.bytes(user.getLoginName()), 1024).toString();
//        user.setPassword(password);
//        //保存登录账号
//        int count = this.userDao.save(user);
//        if (count == 0 || null == user.getId() || null == roleId) {
//            return false;
//        }
//        //保存用户角色信息
//        UserRole userRole = new UserRole(user.getId(), roleId);
//        count = this.userRoleDao.save(userRole);
//        if (count == 0) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public int update(User user) {
        int count = this.userDao.update(user);
        if (count == 0) {
            return 0;
        }
        return count;
    }

    @Override
    public int delete(Integer id) {
        int count = this.userDao.delete(id);
        if (count == 0) {
            return 0;
        }
        return count;
    }

}