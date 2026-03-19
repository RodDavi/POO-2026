import React, { useState } from 'react';
import { motion } from 'motion/react';
import { ArrowLeft, Calendar, TrendingUp, Users, DollarSign } from 'lucide-react';
import { Button } from '../ui/button';
import { Card } from '../ui/card';
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from '../ui/select';
import { LineChart, Line, BarChart, Bar, XAxis, YAxis, CartesianGrid, Tooltip, Legend, ResponsiveContainer } from 'recharts';

interface ReportsProps {
  onBack: () => void;
}

const appointmentsData = [
  { month: 'Jan', consultas: 65 },
  { month: 'Fev', consultas: 72 },
  { month: 'Mar', consultas: 85 },
  { month: 'Abr', consultas: 78 },
  { month: 'Mai', consultas: 92 },
  { month: 'Jun', consultas: 105 },
];

const speciesData = [
  { especie: 'Cães', quantidade: 145 },
  { especie: 'Gatos', quantidade: 98 },
  { especie: 'Pássaros', quantidade: 32 },
  { especie: 'Coelhos', quantidade: 18 },
  { especie: 'Outros', quantidade: 12 },
];

const vetsData = [
  { vet: 'Dr. João', consultas: 85 },
  { vet: 'Dra. Maria', consultas: 72 },
  { vet: 'Dr. Carlos', consultas: 68 },
  { vet: 'Dra. Ana', consultas: 54 },
];

export default function Reports({ onBack }: ReportsProps) {
  const [period, setPeriod] = useState('6months');
  const [selectedVet, setSelectedVet] = useState('all');
  const [selectedSpecies, setSelectedSpecies] = useState('all');

  return (
    <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
      <motion.div
        initial={{ opacity: 0, y: 20 }}
        animate={{ opacity: 1, y: 0 }}
        transition={{ duration: 0.5 }}
      >
        <Button
          variant="ghost"
          onClick={onBack}
          className="mb-6"
        >
          <ArrowLeft size={18} strokeWidth={1.5} className="mr-2" />
          Voltar
        </Button>

        <div className="mb-8">
          <h1 className="text-3xl text-[#14213D] mb-2">Relatórios e Estatísticas</h1>
          <p className="text-gray-600">Visualize métricas e indicadores do pet shop</p>
        </div>

        {/* Filters */}
        <Card className="p-6 mb-8">
          <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
            <div>
              <label className="text-sm text-gray-600 mb-2 block">Período</label>
              <Select value={period} onValueChange={setPeriod}>
                <SelectTrigger>
                  <SelectValue />
                </SelectTrigger>
                <SelectContent>
                  <SelectItem value="1month">Último mês</SelectItem>
                  <SelectItem value="3months">Últimos 3 meses</SelectItem>
                  <SelectItem value="6months">Últimos 6 meses</SelectItem>
                  <SelectItem value="1year">Último ano</SelectItem>
                </SelectContent>
              </Select>
            </div>

            <div>
              <label className="text-sm text-gray-600 mb-2 block">Veterinário</label>
              <Select value={selectedVet} onValueChange={setSelectedVet}>
                <SelectTrigger>
                  <SelectValue />
                </SelectTrigger>
                <SelectContent>
                  <SelectItem value="all">Todos</SelectItem>
                  <SelectItem value="vet1">Dr. João Santos</SelectItem>
                  <SelectItem value="vet2">Dra. Maria Silva</SelectItem>
                  <SelectItem value="vet3">Dr. Carlos Lima</SelectItem>
                </SelectContent>
              </Select>
            </div>

            <div>
              <label className="text-sm text-gray-600 mb-2 block">Espécie</label>
              <Select value={selectedSpecies} onValueChange={setSelectedSpecies}>
                <SelectTrigger>
                  <SelectValue />
                </SelectTrigger>
                <SelectContent>
                  <SelectItem value="all">Todas</SelectItem>
                  <SelectItem value="dog">Cães</SelectItem>
                  <SelectItem value="cat">Gatos</SelectItem>
                  <SelectItem value="bird">Pássaros</SelectItem>
                  <SelectItem value="rabbit">Coelhos</SelectItem>
                </SelectContent>
              </Select>
            </div>
          </div>
        </Card>

        {/* Quick indicators */}
        <div className="grid grid-cols-1 md:grid-cols-4 gap-6 mb-8">
          <Card className="p-6 border-l-4 border-l-blue-500">
            <div className="flex items-center justify-between mb-2">
              <p className="text-sm text-gray-600">Total Consultas</p>
              <Calendar size={20} strokeWidth={1.5} className="text-blue-500" />
            </div>
            <p className="text-3xl text-[#14213D] mb-1">497</p>
            <p className="text-xs text-green-600 flex items-center gap-1">
              <TrendingUp size={12} />
              +15% vs período anterior
            </p>
          </Card>

          <Card className="p-6 border-l-4 border-l-green-500">
            <div className="flex items-center justify-between mb-2">
              <p className="text-sm text-gray-600">Novos Clientes</p>
              <Users size={20} strokeWidth={1.5} className="text-green-500" />
            </div>
            <p className="text-3xl text-[#14213D] mb-1">127</p>
            <p className="text-xs text-green-600 flex items-center gap-1">
              <TrendingUp size={12} />
              +23% vs período anterior
            </p>
          </Card>

          <Card className="p-6 border-l-4 border-l-[#FCA311]">
            <div className="flex items-center justify-between mb-2">
              <p className="text-sm text-gray-600">Taxa Ocupação</p>
              <TrendingUp size={20} strokeWidth={1.5} className="text-[#FCA311]" />
            </div>
            <p className="text-3xl text-[#14213D] mb-1">78%</p>
            <p className="text-xs text-green-600 flex items-center gap-1">
              <TrendingUp size={12} />
              +5% vs período anterior
            </p>
          </Card>

          <Card className="p-6 border-l-4 border-l-purple-500">
            <div className="flex items-center justify-between mb-2">
              <p className="text-sm text-gray-600">Receita</p>
              <DollarSign size={20} strokeWidth={1.5} className="text-purple-500" />
            </div>
            <p className="text-3xl text-[#14213D] mb-1">R$ 45k</p>
            <p className="text-xs text-green-600 flex items-center gap-1">
              <TrendingUp size={12} />
              +18% vs período anterior
            </p>
          </Card>
        </div>

        {/* Charts */}
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-6 mb-8">
          <Card className="p-6">
            <h3 className="text-[#14213D] mb-4">Consultas por Mês</h3>
            <ResponsiveContainer width="100%" height={300}>
              <LineChart data={appointmentsData}>
                <CartesianGrid strokeDasharray="3 3" />
                <XAxis dataKey="month" />
                <YAxis />
                <Tooltip />
                <Legend />
                <Line 
                  type="monotone" 
                  dataKey="consultas" 
                  stroke="#FCA311" 
                  strokeWidth={2}
                  name="Consultas"
                />
              </LineChart>
            </ResponsiveContainer>
          </Card>

          <Card className="p-6">
            <h3 className="text-[#14213D] mb-4">Atendimentos por Espécie</h3>
            <ResponsiveContainer width="100%" height={300}>
              <BarChart data={speciesData}>
                <CartesianGrid strokeDasharray="3 3" />
                <XAxis dataKey="especie" />
                <YAxis />
                <Tooltip />
                <Legend />
                <Bar dataKey="quantidade" fill="#14213D" name="Quantidade" />
              </BarChart>
            </ResponsiveContainer>
          </Card>

          <Card className="p-6">
            <h3 className="text-[#14213D] mb-4">Consultas por Veterinário</h3>
            <ResponsiveContainer width="100%" height={300}>
              <BarChart data={vetsData} layout="vertical">
                <CartesianGrid strokeDasharray="3 3" />
                <XAxis type="number" />
                <YAxis dataKey="vet" type="category" />
                <Tooltip />
                <Legend />
                <Bar dataKey="consultas" fill="#FCA311" name="Consultas" />
              </BarChart>
            </ResponsiveContainer>
          </Card>

          <Card className="p-6">
            <h3 className="text-[#14213D] mb-4">Resumo do Período</h3>
            <div className="space-y-4">
              <div className="flex justify-between items-center p-3 bg-gray-50 rounded-lg">
                <span className="text-gray-700">Total de atendimentos</span>
                <span className="text-[#14213D]">497</span>
              </div>
              <div className="flex justify-between items-center p-3 bg-gray-50 rounded-lg">
                <span className="text-gray-700">Média diária</span>
                <span className="text-[#14213D]">8.3</span>
              </div>
              <div className="flex justify-between items-center p-3 bg-gray-50 rounded-lg">
                <span className="text-gray-700">Animais cadastrados</span>
                <span className="text-[#14213D]">305</span>
              </div>
              <div className="flex justify-between items-center p-3 bg-gray-50 rounded-lg">
                <span className="text-gray-700">Taxa de retorno</span>
                <span className="text-[#14213D]">67%</span>
              </div>
              <div className="flex justify-between items-center p-3 bg-gray-50 rounded-lg">
                <span className="text-gray-700">Horário mais movimentado</span>
                <span className="text-[#14213D]">14h - 16h</span>
              </div>
            </div>
          </Card>
        </div>
      </motion.div>
    </div>
  );
}
