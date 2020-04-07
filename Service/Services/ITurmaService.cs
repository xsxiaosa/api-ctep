﻿using Entities.DTOs;
using Entities.Entities;
using Services.Base;
using System.Collections.Generic;

namespace Services.Services
{
    public interface ITurmaService : IBaseService<Turma>
    {
        IEnumerable<TurmaDTO> ListarTurmas();

        IEnumerable<TurmaDTO> ListarTurmasDeUmCurso(int cursoId);
    }
}
