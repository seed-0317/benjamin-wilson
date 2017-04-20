package com.seed.Service;

import com.seed.DAO.ExpenseDao;
import com.seed.DAO.ExpenseDaoImpl;
import com.seed.DAO.UserDao;
import com.seed.DAO.UserDaoImpl;
import com.seed.Model.User;
import java.util.List;
import java.util.Iterator;

public class BusinessLogic {

    public BusinessLogic() {
    }

    /**
     * @param userID
     * @return person object if logged in successfully, otherwise {@code null}
     */

<<<<<<< HEAD
    public User login(String userID) {
    if (userID == null || userID.isEmpty()) {
        // Could also: throw new IllegalArgumentException();
        return null;
    }
    else {
        UserDao dao = new UserDaoImpl();
        User user = dao.retrieveUser(userID);
        return user;
=======
            Iterator<User> iter = user.listIterator();
            while (iter.hasNext()) {
                User currentUser = iter.next();
                if (currentUser.getUserName().equals(username)) {
                    return currentUser;
                }
            }
            return null;
>>>>>>> ae5e28068b7ef4e9682c1af8b859e9a182c0b2c5
        }
    }
    public void resolveReimbursement(String RS_ID, String RS_STATUS, String managerUserName){
        //update ERSIO.ERS_REIMBURSEMENT_STATUS based on the parameters in the method signature
        ExpenseDao dao = new ExpenseDaoImpl();
        dao.resolveExpense(RS_ID, RS_STATUS, managerUserName);
    }
    public void updateUser(User updatedUser){
        //update ERSIO.ERS_USERS with the updated information
        //update user which matches updatedUser.getUserName()

        UserDao dao = new UserDaoImpl();
        dao.updateUser(updatedUser);
    }
}

