package com.example.testwebatrio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private IUserMapper userMapper;

    // Get All
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userMapper.listeEntitesVersListeDto(userService.getAll()));
    }

    // Save
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody final UserDto userDto) {
        final UserEntity saved = userService.save(userMapper.dtoVersEntite(userDto));

        return new ResponseEntity<>(userMapper.entiteVersDto(saved), HttpStatus.CREATED);
    }

    // Get One
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") final Long id) {

        final UserEntity UserEntity = this.userService.findById(id);

        return new ResponseEntity<>(userMapper.entiteVersDto(UserEntity), HttpStatus.OK);
    }

    // Update
    @PutMapping
    public ResponseEntity<UserDto> updateUser(@RequestBody final UserDto userDto) {

        final UserEntity saved = this.userService.update(userMapper.dtoVersEntite(userDto));

        return new ResponseEntity<>(userMapper.entiteVersDto(saved), HttpStatus.OK);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") final Long id) {
        this.userService.deleteById(id);
    }


    //Get by nom
    @GetMapping("/nom={nom}")
    public ResponseEntity<List<UserDto>> getUserByVille(@PathVariable("nom") final String nom) {
        return ResponseEntity.ok(userMapper.listeEntitesVersListeDto(userService.findByNom(nom)));
    }
}

