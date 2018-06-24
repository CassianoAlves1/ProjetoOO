package com.projetoOO.projetoOO.projRepository;

import com.projetoOO.projetoOO.projModel.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findById(long id);
}
