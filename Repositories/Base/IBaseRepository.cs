﻿using Entities;
using Microsoft.EntityFrameworkCore.Storage;
using System.Collections.Generic;

namespace Repositories.Base
{
    public interface IBaseRepository<TEntity> where TEntity : BaseEntity
    {
        bool Add(TEntity entity);
        bool Update(TEntity entity);
        TEntity GetById(int id);
        bool Delete(int id);
        IEnumerable<TEntity> All();
        int SaveChanges();
        IDbContextTransaction GetTransaction();
    }
}
