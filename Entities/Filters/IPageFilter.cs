﻿using System;
using System.Collections.Generic;
using System.Text;

namespace Entities.Filters
{
    public interface IPageFilter
    {
        int Pagina { get; set; }
        int TamanhoPagina { get; }
    }
}
