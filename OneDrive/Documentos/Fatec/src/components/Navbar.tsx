import React from 'react';
import { Dog, Home, Calendar, FolderOpen, History, Users, BarChart3, UserCircle, LogOut } from 'lucide-react';
import { Button } from './ui/button';
import type { User } from '../App';

interface NavbarProps {
  user: User;
  onNavigate: (page: string) => void;
  onLogout: () => void;
  currentPage: string;
}

export default function Navbar({ user, onNavigate, onLogout, currentPage }: NavbarProps) {
  const getMenuItems = () => {
    const common = [
      { id: 'dashboard', label: 'Início', icon: Home },
      { id: 'history', label: 'Histórico', icon: History },
    ];

    if (user.role === 'secretary') {
      return [
        ...common.slice(0, 1),
        { id: 'scheduling', label: 'Consultas', icon: Calendar },
        { id: 'registrations', label: 'Cadastros', icon: FolderOpen },
        ...common.slice(1),
      ];
    }

    if (user.role === 'vet') {
      return common;
    }

    if (user.role === 'admin') {
      return [
        ...common.slice(0, 1),
        { id: 'users', label: 'Usuários', icon: Users },
        { id: 'reports', label: 'Relatórios', icon: BarChart3 },
        ...common.slice(1),
      ];
    }

    return common;
  };

  const menuItems = getMenuItems();

  return (
    <nav className="fixed top-0 left-0 right-0 bg-white shadow-md z-50">
      <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
        <div className="flex justify-between items-center h-16">
          {/* Logo */}
          <div className="flex items-center gap-2">
            <div className="bg-[#FCA311] p-2 rounded-lg">
              <Dog size={24} strokeWidth={1.5} className="text-[#14213D]" />
            </div>
            <span className="text-xl text-[#14213D]">PetCare</span>
          </div>

          {/* Menu items */}
          <div className="hidden md:flex items-center gap-1">
            {menuItems.map((item) => {
              const Icon = item.icon;
              const isActive = currentPage === item.id;
              
              return (
                <button
                  key={item.id}
                  onClick={() => onNavigate(item.id)}
                  className={`flex items-center gap-2 px-4 py-2 rounded-lg transition-all ${
                    isActive
                      ? 'bg-[#FCA311] text-[#14213D]'
                      : 'text-gray-700 hover:bg-gray-100'
                  }`}
                >
                  <Icon size={18} strokeWidth={1.5} />
                  <span>{item.label}</span>
                </button>
              );
            })}
          </div>

          {/* User menu */}
          <div className="flex items-center gap-4">
            <div className="hidden sm:flex items-center gap-2 text-sm text-gray-700">
              <UserCircle size={20} strokeWidth={1.5} />
              <span>{user.name}</span>
            </div>
            <Button
              variant="ghost"
              size="sm"
              onClick={onLogout}
              className="text-gray-700 hover:text-red-600"
            >
              <LogOut size={18} strokeWidth={1.5} />
              <span className="ml-2 hidden sm:inline">Sair</span>
            </Button>
          </div>
        </div>
      </div>

      {/* Mobile menu */}
      <div className="md:hidden border-t border-gray-200 bg-white">
        <div className="flex overflow-x-auto px-4 py-2 gap-2">
          {menuItems.map((item) => {
            const Icon = item.icon;
            const isActive = currentPage === item.id;
            
            return (
              <button
                key={item.id}
                onClick={() => onNavigate(item.id)}
                className={`flex flex-col items-center gap-1 px-3 py-2 rounded-lg whitespace-nowrap transition-all ${
                  isActive
                    ? 'bg-[#FCA311] text-[#14213D]'
                    : 'text-gray-700'
                }`}
              >
                <Icon size={18} strokeWidth={1.5} />
                <span className="text-xs">{item.label}</span>
              </button>
            );
          })}
        </div>
      </div>
    </nav>
  );
}
