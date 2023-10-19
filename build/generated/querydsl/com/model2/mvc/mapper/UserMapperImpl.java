package com.model2.mvc.mapper;

import com.model2.mvc.entity.UserEntity;
import com.model2.mvc.service.domain.User;
import java.sql.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-18T19:48:55+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 17.0.8.1 (JetBrains s.r.o.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userEntityToUser(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.userId( entity.getUserId() );
        user.userName( entity.getUserName() );
        user.password( entity.getPassword() );
        user.role( entity.getRole() );
        user.ssn( entity.getSsn() );
        user.phone( entity.getPhone() );
        user.addr( entity.getAddr() );
        user.email( entity.getEmail() );
        if ( entity.getRegDate() != null ) {
            user.regDate( new Date( entity.getRegDate().getTime() ) );
        }

        return user.build();
    }

    @Override
    public UserEntity userToUserEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.userId( user.getUserId() );
        userEntity.userName( user.getUserName() );
        userEntity.password( user.getPassword() );
        userEntity.role( user.getRole() );
        userEntity.ssn( user.getSsn() );
        userEntity.phone( user.getPhone() );
        userEntity.addr( user.getAddr() );
        userEntity.email( user.getEmail() );

        return userEntity.build();
    }
}
