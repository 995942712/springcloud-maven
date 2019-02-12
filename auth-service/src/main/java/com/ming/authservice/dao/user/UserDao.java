package com.ming.authservice.dao.user;

import com.ming.authservice.domain.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * ////////////////////////////////////////////////////////
 * //                     _ooOoo_                        //
 * //                    o8888888o                       //
 * //                    88" . "88                       //
 * //                    (| ^_^ |)                       //
 * //                    O\  =  /O                       //
 * //                 ____/`---'\____                    //
 * //               .'  \\|     |//  `.                  //
 * //              /  \\|||  :  |||//  \                 //
 * //             /  _||||| -:- |||||-  \                //
 * //             |   | \\\  -  /// |   |                //
 * //             | \_|  ''\---/''  |   |                //
 * //             \  .-\__  `-`  ___/-. /                //
 * //           ___`. .'  /--.--\  `. . ___              //
 * //         ."" '<  `.___\_<|>_/___.'  >'"".           //
 * //       | | :  `- \`.;`\ _ /`;.`/ - ` : | |          //
 * //       \  \ `-.   \_ __\ /__ _/   .-` /  /          //
 * // ========`-.____`-.___\_____/___.-`____.-'========= //
 * //                      `=---='                       //
 * // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ //
 * //       佛祖保佑       永不宕机     永无BUG            //
 * ////////////////////////////////////////////////////////
 */
@Mapper
public interface UserDao {

    /**
     * 查询登录账号列表
     * @return
     */
    List<User> findAll();

    /**
     * 模糊查询登录账号列表
     * @param user
     * @return
     */
    List<User> findList(User user);

    /**
     * 根据id查询登录账号信息
     * @param id
     * @return
     */
    User findById(@Param("id") Integer id);

    /**
     * 根据登录账号查询登录账号信息
     * @param loginName
     * @return
     */
    User findByLoginName(@Param("loginName") String loginName);

    /**
     * 保存登录账号信息
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 更新登录账号信息
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 删除登录账号信息
     * @param id
     * @return
     */
    int delete(@Param("id") Integer id);

}