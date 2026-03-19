import React from 'react';
import { motion } from 'motion/react';
import { Users, BarChart3, Calendar, TrendingUp } from 'lucide-react';
import { Card } from '../ui/card';

interface AdminDashboardProps {
  onNavigate: (page: string) => void;
}

const dashboardCards = [
  {
    id: 'users',
    title: 'Gerenciar Usuários',
    description: 'Adicionar, editar e remover usuários',
    icon: Users,
    color: 'from-blue-500 to-blue-600',
  },
  {
    id: 'reports',
    title: 'Relatórios',
    description: 'Visualize estatísticas e métricas',
    icon: BarChart3,
    color: 'from-[#FCA311] to-orange-600',
  },
];

export default function AdminDashboard({ onNavigate }: AdminDashboardProps) {
  return (
    <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
      <motion.div
        initial={{ opacity: 0, y: 20 }}
        animate={{ opacity: 1, y: 0 }}
        transition={{ duration: 0.5 }}
      >
        <h1 className="text-3xl text-[#14213D] mb-2">Painel do Administrador</h1>
        <p className="text-gray-600 mb-8">Gerencie o sistema e visualize relatórios</p>

        {/* Quick stats */}
        <div className="grid grid-cols-1 md:grid-cols-4 gap-6 mb-12">
          <Card className="p-6 border-l-4 border-l-blue-500">
            <div className="flex items-center justify-between mb-2">
              <p className="text-sm text-gray-600">Consultas (mês)</p>
              <Calendar size={20} strokeWidth={1.5} className="text-blue-500" />
            </div>
            <p className="text-3xl text-[#14213D]">342</p>
            <p className="text-xs text-green-600 mt-1 flex items-center gap-1">
              <TrendingUp size={12} />
              +12% vs mês anterior
            </p>
          </Card>

          <Card className="p-6 border-l-4 border-l-green-500">
            <div className="flex items-center justify-between mb-2">
              <p className="text-sm text-gray-600">Médicos Ativos</p>
              <Users size={20} strokeWidth={1.5} className="text-green-500" />
            </div>
            <p className="text-3xl text-[#14213D]">8</p>
          </Card>

          <Card className="p-6 border-l-4 border-l-[#FCA311]">
            <div className="flex items-center justify-between mb-2">
              <p className="text-sm text-gray-600">Novos Clientes</p>
              <Users size={20} strokeWidth={1.5} className="text-[#FCA311]" />
            </div>
            <p className="text-3xl text-[#14213D]">47</p>
            <p className="text-xs text-green-600 mt-1 flex items-center gap-1">
              <TrendingUp size={12} />
              +23% vs mês anterior
            </p>
          </Card>

          <Card className="p-6 border-l-4 border-l-purple-500">
            <div className="flex items-center justify-between mb-2">
              <p className="text-sm text-gray-600">Usuários Sistema</p>
              <Users size={20} strokeWidth={1.5} className="text-purple-500" />
            </div>
            <p className="text-3xl text-[#14213D]">15</p>
          </Card>
        </div>

        {/* Main action cards */}
        <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
          {dashboardCards.map((card, index) => {
            const Icon = card.icon;
            return (
              <motion.div
                key={card.id}
                initial={{ opacity: 0, y: 20 }}
                animate={{ opacity: 1, y: 0 }}
                transition={{ duration: 0.5, delay: index * 0.1 }}
              >
                <Card
                  className="p-8 cursor-pointer transition-all hover:shadow-xl hover:-translate-y-1 border-0"
                  onClick={() => onNavigate(card.id)}
                >
                  <div className={`w-16 h-16 rounded-xl bg-gradient-to-br ${card.color} flex items-center justify-center mb-4`}>
                    <Icon size={32} strokeWidth={1.5} className="text-white" />
                  </div>
                  <h3 className="text-xl text-[#14213D] mb-2">{card.title}</h3>
                  <p className="text-gray-600">{card.description}</p>
                </Card>
              </motion.div>
            );
          })}
        </div>
      </motion.div>
    </div>
  );
}
