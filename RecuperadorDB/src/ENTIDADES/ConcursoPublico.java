/*
 * Copyright (C) 2018 mgarcia
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ENTIDADES;

/**
 *
 * @author mgarcia
 */
public class ConcursoPublico {
    private int IdConcursoPublico;
    private String CodConcurso;
    private int EditalNum;
    private int EditalAno;
    
    public void setIdConcursoPublico(int id) {
        this.IdConcursoPublico = id;
    }
    public int getIdConcursoPublico() {
        return this.IdConcursoPublico;
    }
    
    public void setCodConcurso(String cod) {
        this.CodConcurso = cod;
    }
    public String getCodConcurso() {
        return this.CodConcurso;
    }
    
    public void setEditalNum(int num) {
        this.EditalNum = num;
    }
    public int getEditalNum(){
        return this.EditalNum;
    }
    
    public void setEditalAno(int ano) {
        this.EditalAno = ano;
    }
    public int getEditalAno(){
        return this.EditalAno;
    }
}
